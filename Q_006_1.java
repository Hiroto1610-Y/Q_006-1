import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Q_006_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //審査員集団の数
        int n = sc.nextInt();
        
        //評点のリスト
        ArrayList<Integer> score  = new ArrayList<>();

        //リストのscoreに審査員（5*n）数値を入れる
        for (int i = 0; i < 5*n; i++){
            score.add(sc.nextInt());
        }

        //リストのscoreを「昇順」に並び替え
        Collections.sort(score);

        //最小からn回消す
        for (int i = 0; i < n; i++){
            score.remove(i);
        }

        //リストのscoreを「降順」に並び替え
        Collections.sort(score, Collections.reverseOrder());

        //最大からn回消す
        for (int i = 0; i < n; i++){
            score.remove(i);
        }

        //sum初期化
        int sum = 0;

        //score全部の要素を足す
        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i); 
        }

        //小数に変換したsumを要素数で割って平均を求める
        double average = (double) sum / score.size();

        //出力
        System.out.println(average);
    }
}