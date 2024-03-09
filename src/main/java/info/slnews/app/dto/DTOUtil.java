package info.slnews.app.dto;

import info.slnews.app.entity.Activities;
import info.slnews.app.entity.Education;
import info.slnews.app.entity.MemberInfo;
import info.slnews.app.entity.PoliticalHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DTOUtil {

    private static Logger logger = LoggerFactory.getLogger(DTOUtil.class);

    public static MemberInfo dtoToEntity(MemberDto dto) {
        return new MemberInfo(dto.getId(), dto.getTitle(), dto.getFullName(), dto.getAddress(), dto.getDateOfBirth(),
                dto.getEmail(), dto.getPhoneNo(), dto.getImage(),
                null, dto.getMemberStatus(), Instant.now());
    }

    public static List<PoliticalHistory> dtoToPoliticalEntity(List<PoliticalHistoryDto> dtoList, Long memberId) {
        List<PoliticalHistory> entities = new ArrayList<>();
        for(PoliticalHistoryDto dto : dtoList) {
            entities.add(
                    new PoliticalHistory(dto.getId(), dto.getRole(), dto.getStart(), dto.getNoOfYears(), memberId));
        }
        return entities;
    }

    public static List<Education> dtoToEducationEntity(List<EducationHistoryDto> dtoList, Long memberId) {
        List<Education> entities = new ArrayList<>();
        for(EducationHistoryDto dto : dtoList) {
            entities.add(new Education(dto.getId(), dto.getQualification(), dto.getInstitution(), dto.getFrom(),
                    dto.getTo(), dto.getStatus(), dto.getDescription(),
                    memberId));
        }
        return entities;
    }

    public static List<Activities> dtoToActivityEntity(List<ActivityHistoryDto> dtoList, Long memberId) {
        List<Activities> entities = new ArrayList<>();
        for(ActivityHistoryDto dto : dtoList) {
            entities.add(
                    new Activities(dto.getId(), dto.getRole(), dto.getDescription(), dto.getDate(), dto.getCategory(),
                            memberId));
        }
        return entities;
    }

    public static MemberDto entityToDto(MemberInfo entity) {
        MemberDto infoDto = new MemberDto(entity.getId(), entity.getTitle(), entity.getName(), entity.getAddress(),
                entity.getDateOfBirth(), entity.getEmail(), entity.getPhoneNo(), entity.getImage(), entity.getStatus());

        return infoDto;
    }

    public static <T extends Enum<T>> Map<String, String> getConstantMap(Class<T> klass) {
        Map<String, String> vals = new HashMap<>(0);

        try {
            Method m = klass.getMethod("values");
            Object obj = m.invoke(null);

            for (Enum<T> enumval : (Enum<T>[]) obj) {
                vals.put(enumval.name(), enumval.toString());
            }

        } catch (Exception ex) {
            logger.error("Error on get enum key-value map", ex);
        }

        return vals;
    }

}
