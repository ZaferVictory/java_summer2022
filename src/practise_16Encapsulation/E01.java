package practise_16Encapsulation;

public class E01 {

    public static void main(String[] args) {

        class laptop{

            private String model;
            private String year;
            private String memory;
            private String processor;

            public String getModel() {
                return model;
            }



            public String getYil() {
                return year;
            }



            public String getMemory() {
                return memory;
            }

            public void setMemory(String memory) {
                this.memory = memory;
            }

            public String getProcessor() {
                return processor;
            }

            public void setProcessor(String processor) {
                this.processor = processor;
            }

            @Override
            public String toString() {
                return "laptop{" +
                        "model='" + model + '\'' +
                        ", year='" + year + '\'' +
                        ", memory='" + memory + '\'' +
                        ", processor='" + processor + '\'' +
                        '}';
            }
        }
    }
}
