# voting-backend

### build and deploy
./gradlew build
docker build -t backend/latest .
docker network create voting-nw
docker run -d -p 8080:8080 --network voting-nw --name backend backend/latest
docker network inspect voting-nw

docker run --name mysql \
--network voting-nw \
--restart unless-stopped \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
-v /Users/timmy/work/voting-db/:/var/lib/mysql \
mysql:8

docker run -d -p 8080:8080 -name backend backend/latest
    docker build -t voting-app .
    docker run -p 8080:8080 voting-app
    docker run --env-file variables.env --rm -p 8080:8080 voting-app
##### slnews-db
    liquibase diff-changelog --changelog-file=sample-changelog.xml
    liquibase update --changelog-file=example-changelog.xml