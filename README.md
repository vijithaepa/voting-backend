# voting-backend
voting-backend


slnews-db
docker build -t voting-app .
docker run -p 8080:8080 voting-app
docker run --env-file variables.env --rm -p 8080:8080 voting-app

liquibase diff-changelog --changelog-file=sample-changelog.xml
liquibase update --changelog-file=example-changelog.xml