public class maximummarksArray {
    public static void main(String[] args){
        int marks[] = {34, 44, 56, 97, 81, 34};
        int max = marks[0];
        for(int i = 1; i < marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("Maximum marks: " + max);

    }
}
