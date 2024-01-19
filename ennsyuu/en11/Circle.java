package ennsyuu.en11;


    class Circle {
        double PI = 3.1415;
    
        double circumference(int radius) {
            double circle = (radius * 2) * PI;
            return circle;
        }
    
        double area(int radius) {
            double circleArea = PI * radius * radius;
            return circleArea;
        }
    }

