FROM openjdk:17-jdk-slim
# Configuración de ambiente
COPY target/ubigeos-microservice-0.0.1-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "java -jar app.jar --spring.datasource.url=jdbc:postgresql://${DB_HOST}:${DB_PORT}/rgs_sunat"]