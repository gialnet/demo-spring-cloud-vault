# demo-spring-cloud-vault

>jdk javac 11.0.11

where the "application" is injected as the spring.application.name in the SpringApplication (i.e. what is normally "application" in a regular Spring Boot app), "profile" is an active profile (or comma-separated list of properties). Properties retrieved from Vault will be used "as-is" without further prefixing of the property names.

>Spring Boot provides since version 2.4 a ConfigData API that allows the declaration of configuration sources and importing these as property sources.

Spring Cloud Vault uses as of version 3.0 the ConfigData API to mount Vault’s secret backends as property sources. In previous versions, the Bootstrap context was used. The ConfigData API is much more flexible as it allows specifying which configuration systems to import and in which order.

>You can enable the deprecated bootstrap context either by setting the configuration property spring.cloud.bootstrap.enabled=true or by including the dependency org.springframework.cloud:spring-cloud-starter-bootstrap.

>backend sets the path of the secret mount to use

default-context sets the context name used by all applications

application-name overrides the application name for use in the key-value backend

profiles overrides the active profiles for use in the key-value backend

profile-separator separates the profile name from the context in property sources with profiles


