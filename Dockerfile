FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/demo-luminus.jar /demo-luminus/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/demo-luminus/app.jar"]
