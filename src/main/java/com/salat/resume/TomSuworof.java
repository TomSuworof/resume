package com.salat.resume;

/**
 * Resume data holder for Tom Suworof.
 */
public class TomSuworof implements Person {
    private TomSuworof() {
        
    }
    
    /**
     * Get person name.
     *
     * @return Tom Suworof.
     */
    public String getName() {
        return "Tom Suworof";
    }

    /**
     * Get person email.
     *
     * @return <a href="mailto:rc1995king@gmail.com">rc1995king@gmail.com</a>
     */
    public String getEmail() {
        return "rc1995king@gmail.com";
    }

    /**
     * Get person Telegram.
     *
     * @return <a href="https://t.me/tom_suworof">tom_suworof</a>
     */
    public String getTelegram() {
        return "tom_suworof";
    }

    /**
     * Get person skills.
     *
     * @return
     * <ul>
     * <li>Spring Framework (Boot, MVC, JPA, Reactor и Security)</li>
     * <li>Java 8-21, primarky 8, 11 and 17</li>
     * <li>Java Collections API, Streams, Multithreading</li>
     * <li>Git, GitHub, GitLab</li>
     * <li>Maven</li>
     * <li>Familiarity with Python, JavaScript</li>
     * </ul>
     */
    public String getSkills() {
        return """
        <ul>
        <li>Spring Framework (Boot, MVC, JPA, Reactor и Security)</li>
        <li>Java 8-21, primarky 8, 11 and 17</li>
        <li>Java Collections API, Streams, Multithreading</li>
        <li>Git, GitHub, GitLab</li>
        <li>Maven</li>
        <li>Familiarity with Python, JavaScript</li>
        </ul>
        """;
    }

    /**
     * Get person education.
     *
     * @return
     * <ul>
     * <li>
     * NRU Higher School of Economics, bachelor’s degree of faculty of Informatics,
     * Mathematics and Computer Science, direction of Business Informatics
     * </li>
     * <li>
     * NRU Higher School of Economics, 1st year of master’s degree of faculty of Informatics,
     * Mathematics and Computer Science, direction of Business Informatics
     * </li>
     * </ul>
     */
    public String getEducation() {
        return """
        <ul>
        <li>
        NRU Higher School of Economics, bachelor’s degree of faculty of Informatics,
        Mathematics and Computer Science, direction of Business Informatics
        </li>
        <li>
        NRU Higher School of Economics, 1st year of master’s degree of faculty of Informatics,
        Mathematics and Computer Science, direction of Business Informatics
        </li>
        </ul>
        """;
    }

    /**
     * Get person experience.
     *
     * @return
     * <ul>
     * <li>
     * <b>August 2021 — now.</b> Sigur, Nizhniy Novgorod. I am working on client server installable app for access
     * security management.
     * Tech stack: Spring, H2, Java Swing (desktop UI), C++, Maven, Ant, Gradle.
     * </li>
     * <li>
     * <b>September 2021 — June 2022.</b> NetCracker, Nizhniy Novgorod. I was working on a microservice for CRM.
     * Tech stack: Quarkus, Postgres, Kubernetes, Jenkins, Arquillian, JUnit, Kafka.
     * </li>
     * <li>
     * I have profile on GitHub with educational and my own projects: <a href="https://github.com/TomSuworof">Tom Suworof's GitHub</a>.
     * </li>
     * <li>
     * Experience in solving algorithm problems
     * on LeetCode: <a href="https://leetcode.com/TomSuworof/">Tom Suworof's LeetCode</a>.
     * </li>
     * </ul>
     */
    public String getExperience() {
        return """
        <ul>
        <li>
        <b>August 2021 — now.</b> Sigur, Nizhniy Novgorod. I am working on client server installable app for access
        security management.
        Tech stack: Spring, H2, Java Swing (desktop UI), C++, Maven, Ant, Gradle.
        </li>
        <li>
        <b>September 2021 — June 2022.</b> NetCracker, Nizhniy Novgorod. I was working on a microservice for CRM.
        Tech stack: Quarkus, Postgres, Kubernetes, Jenkins, Arquillian, JUnit, Kafka.
        </li>
        <li>
        I have profile on GitHub with educational and my own projects (github.com/TomSuworof)
        </li>
        <li>
        Experience in solving algorithm problems
        on binarysearch.io platform(Codewars analog): binarysearch.io/@/tom_suworof
        on leetcode: leetcode.com/TomSuworof
        </li>
        </ul>
        """;
    }
}