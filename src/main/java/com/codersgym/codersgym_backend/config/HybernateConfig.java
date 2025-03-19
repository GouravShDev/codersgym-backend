package com.codersgym.codersgym_backend.config;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HybernateConfig {

    @Bean
    public SessionFactory sessionFactory(){
        EntityManagerFactory entityManagerFactory = new EntityManagerFactory() {
        }
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
}
