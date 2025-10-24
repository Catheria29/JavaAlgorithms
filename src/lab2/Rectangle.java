package lab2;

    public class Rectangle extends Shape {
        private double height, width;
        private double x, y;

        public Rectangle(double height, double width, double x, double y) {
            this.height = height;
            this.width = width;
            this.x = x;
            this.y = y;
        }

        @Override
        public double calculateArea() {
            return height * width;
        }

        @Override
        public double calculateCircumference() {
            return 2 * (height + width);
        }

        @Override
        public double getX() {
            return x;
        }

        @Override
        public void setX(double x) {
            this.x = x;
        }

        @Override
        public void setY(double y) {
            this.y = y;
        }

        @Override
        public double getY() {
            return y;
        }




        @Override
        public String toString() {
            return "Rectangle with height: " + String.format("%.2f", height) +
                    " and width: " + String.format("%.2f", width) +
                    " Centered at X: " + String.format("%.2f", x) + " Y: " + String.format("%.2f", y);
        }
    }

