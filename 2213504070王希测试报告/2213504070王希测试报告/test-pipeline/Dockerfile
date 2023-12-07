FROM openjdk:8-jre-alpine
LABEL maintainer=chendelin
ENV JAVA_OPTS="-Xms256m -Xmx256m"
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY target/*.jar /app.jar
#暴露应用端口
EXPOSE 8080

ENTRYPOINT ["/bin/sh","-c","java ${JAVA_OPTS} -jar app.jar"]
#CMD ["java","-Xms256m","-Xmx256m","-jar","/app.jar"]


