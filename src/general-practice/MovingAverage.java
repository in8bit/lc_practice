
class MovingAverage {
    private int[] window;
    private int tail = -1;
    private int total =0; // counter to get the total

    public MovingAverage(int size) {
        window = new int[size];
    }

    public double next(int val) {
        double avg = 0.0;
        int sum = 0;

        if (total < window.length){
            total ++;
        }

        if (tail == -1 || tail == window.length - 1) {
            tail = 0;
        } else {
            tail++;
        }

        window[tail] = val;

        for (int i = 0; i < window.length; i++) {
            sum = sum + window[i];
        }

        avg = (double)sum / (double)total; // explicit casting to double
        return avg;
    }
    // main
    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        double param_1 = obj.next(1);
        double param_2 = obj.next(10);
        double param_3 = obj.next(3);
        double param_4 = obj.next(5);
        double param_5 = obj.next(0);

        System.out.println("param 1 - "+ param_1);
        System.out.println("param 2 - "+ param_2);
        System.out.println("param 3 - "+ param_3);
        System.out.println("param 4 - "+ param_4);
        System.out.println("param 5 - "+ param_5);

    }
}
