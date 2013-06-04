public class arrayExample {

    int number[];

    public static void main(String[] args){

        arrayExample example = new arrayExample();

        example.example();

    }

    public void example(){

        int repeats = 10000;

        number = new int[repeats];

        for(int i = 0; i < repeats; i++){
            int number_temp = i * i;
            System.out.println("Number_1:" + i + ":" + number_temp);
            number[i] = number_temp;
        }

        for(int j = 0; j < repeats; j++){

            if(j >= 10 && j <= 20){
                 System.out.println("Number_2:" + j + ":" + number[j]);
             }

            if(j >= 50 && j <= 60){
                System.out.println("Number_2:" + j + ":" + number[j]);
            }

            if(j >= 80 && j <= 90){
                System.out.println("Number_2:" + j + ":" + number[j]);
            }
        }

    }
}
