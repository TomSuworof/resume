package com.salat.resume;

/**
 * Interface for person data holder.
 */
public interface Person {
    /**
     * Get name of person.
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
     * Get person telegram.
     *
     * @return person telegram.
     */
    String getTelegram();
}