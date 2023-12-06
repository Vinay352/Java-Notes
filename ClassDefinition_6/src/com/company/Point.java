package com.company;

public class Point {
    // class variable
    static int soManyPoints;	// so many points were created.

    private int x;		// x coordinate of the point
    private int y;		// y cooridnate of the point

    /**
     * Default Constructor.
     * Increases the counter soManyPoints by 1.
     *
     * @return	      Point a Point object
     */
    public Point(){
        super();
        System.out.println("	in Point() constructor");
        soManyPoints ++;
    }

    /**
     * Constructor.
     * initialize x and y values of a point.
     *
     * @param       x	x coordinate
     * @param       y	y coordinate
     *
     * @return	      Point a Point object
     */
    public Point(int x, int y){
        super();
        this.x = x;
        this.y = y;
        System.out.println("	in Point(int, int) constructor");
    }

    /**
     * So many points have been created.
     *
     * @return int So many points have been created
     */
    public static int soManyPoints(){
        return soManyPoints;
    }

    /**
     * initialzes x and y of a point.
     *
     * @param       x	int x coordinate
     * @param       y	int y coordinate
     *
     * @return	      Point a Point object
     */
    public Point initPoint(int x, int y){
        System.out.println("	in initPoint(int, int)");

        this.x = x;
        this.y = y;

        return this;
    }

    /**
     * move a point
     *
     * @param       x	int delta x value
     * @param       y	int delta y value
     *
     * @return	      Point a Point object
     */
    public Point move(int x, int y){
        System.out.println("	in move(int, int)");

        this.x += x;
        this.y += y;

        return this;
    }

    /**
     * Returns the x coordinate of a point
     *
     * @return	      int x value
     */
    public int getX(){
        System.out.println("	in getX()");
        return this.x;
    }

    /**
     * Returns the y coordinate of a point
     *
     * @return	      int x value
     */
    public int getY(){
        System.out.println("	in getY()");
        return this.y;
    }
}
