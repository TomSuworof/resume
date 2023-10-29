package com.salat.resume;

/**
 * Interface for person data holder.
 */
public interface Person {
    /**
     * Get person name.
     *
     * @return person name.
     */
    String getName();
    
    /**
     * Get person email.
     *
     * @return person email.
     */
    String getEmail();
    
    /**
     * Get person Telegram.
     *
     * @return person Telegram.
     */
    String getTelegram();

    /**
     * Get person skills.
     *
     * @return person skills.
     */
    String getSkills();

    /**
     * Get person education.
     *
     * @return person education.
     */
    String getEducation();

    /**
     * Get person experience.
     *
     * @return person experience.
     */
    String getExperience();
}