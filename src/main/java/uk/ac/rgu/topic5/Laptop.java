package uk.ac.rgu.topic5;

public class Laptop {

    public class LaptopScreen{
        private int size;
        public int getSize() {
            return size;
        }

        private String resoluiton;

        public String getResoluiton() {
            return resoluiton;
        }

        //private <something> material

        public LaptopScreen(int size, String resolution){
            this.size=size;
            this.resoluiton = resolution;
        }
    }
    
}
