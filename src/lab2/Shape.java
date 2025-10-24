package lab2;

    public abstract class Shape {
        protected  double x;
        protected double y;
        public abstract double calculateArea();
        public abstract double calculateCircumference();
        public abstract double getX();
        public abstract double getY();
        public abstract void setY(double y);
        public abstract void setX(double x);
        public abstract String toString();


}
