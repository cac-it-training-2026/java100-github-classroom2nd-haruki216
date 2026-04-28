package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("\nゲームスタート！\n");

		String[] stations = new String[29]; // 使用済み
		String[] aws = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿",
				"有楽町", "目黒", "大崎", "原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里",
				"西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();

		int count = 0;

		while (count < aws.length) {

			// ユーザー入力
			String input = reader.readLine();

			// ① 山手線にあるかチェック　あったら抜ける
			boolean exists = false;//あったらtrueにする
			for (String s : aws) {
				if (s.equals(input)) {
					exists = true;
					break;
				}
			}

			if (!exists) {//ある場合はすり抜け
				System.out.println("あなたの負けです！");
				return;
			}

			// ② 既出チェック　
			for (int i = 0; i < count; i++) {
				if (stations[i].equals(input)) { //入力した値保持しているリストと入力値で判断
					System.out.println("あなたの負けです！");
					return;
				}
			}

			// 登録
			stations[count++] = input;

			// 全部出たら勝ち
			if (count == aws.length) {
				System.out.println("あなたの勝ちです！");
				return;
			}

			// ③ コンピュータのターン
			while (true) {
				int r = rand.nextInt(aws.length);//ランダムな値を獲得
				String comp = aws[r];

				boolean used = false;
				for (int i = 0; i < count; i++) {
					if (stations[i].equals(comp)) {//回答の中にあったらtrueにして終わり
						used = true;
						break;
					}
				}

				if (!used) { //true	中にあったら起動しない
					System.out.println(comp);
					stations[count++] = comp;
					break;
				}
			}
		}
	}
}