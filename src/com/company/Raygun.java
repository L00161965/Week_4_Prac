/*
 * Classname: Raygun.java
 *
 * Version information: 1.0
 *
 * Date: 21/01/2021
 *
 * Description: The class implements a ray gun for a game
 *
 * Author: Dr. Shane Wilson
 *
 */

package com.company;

public class Raygun {
    //Data members
    private int mChrg; //The maximum charge the Raygun can hold
    private int cChrg; //The current level of charge the Raygun has

    //Class constructors
    public Raygun(int mChrg, int cChrg) {
        //TODO: Construct the Raygun object and initialise the attributes
        this.mChrg = mChrg;
        this.cChrg = cChrg;
    }

    // Methods
    //TODO: Implement appropriate getters and setters for the class

    public int fireAt(Alien a) {
        //TODO: Implement the method
        /*The gun should only fire if it is charged. Firing the gun will reduce the charge by 1. If the bug isDodging
         * bug.miss() should be called, otherwise bug.hit */
        if (cChrg > 0) {
            cChrg--;
            if (a.isDodging()) {
                a.miss();
            } else {
                a.hit();
            }

        }
        return cChrg;
    }

    public int recharge() {
        //TODO: Implement the method
        /*Increases the current charge by 1*/
        if (!isFullyCharged()) {
            cChrg++;
            return cChrg;
        }else{

            return cChrg;
        }

    }

    public boolean isCharged() {
        //TODO: Implement the method
        /*Returns true if the gun has a charge*/
        return cChrg > 0;
    }

    public boolean isFullyCharged() {
        //TODO: Implement the method
        /*Returns true if the gun is fully charged*/
        return cChrg == mChrg;
    }
}
