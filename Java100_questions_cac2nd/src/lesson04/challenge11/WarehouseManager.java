/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] randomboxC = new int[5];
		int[] randomboxD = new int[5];
		int[] randomboxE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < 5; i++) {
			int randomnum = (int) (Math.random() * 10 % 4 + 1);
			int random = (int) (Math.random() * 10);
			if (randomnum == 1) {
				randomboxC[i] = 0;
			} else {
				randomboxC[i] = random;
			}
		}
		for (int i = 0; i < 5; i++) {
			int randomnum = (int) (Math.random() * 10 % 4 + 1);
			int random = (int) (Math.random() * 10);
			if (randomnum == 1) {
				randomboxD[i] = 0;
			} else {
				randomboxD[i] = random;
			}
		}
		for (int i = 0; i < 5; i++) {
			int randomnum = (int) (Math.random() * 10 % 4 + 1);
			int random = (int) (Math.random() * 10);
			if (randomnum == 1) {
				randomboxE[i] = 0;
			} else {
				randomboxE[i] = random;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (1 != 4) {
				System.out.print(randomboxC[i]);
			} else {
				System.out.println(randomboxC[i]);
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (1 != 4) {
				System.out.print(randomboxD[i]);
			} else {
				System.out.println(randomboxD[i]);
			}
		}
		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (1 != 4) {
				System.out.print(randomboxE[i]);
			} else {
				System.out.println(randomboxE[i]);
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		int[] list = new int[15];
		int index = 0;
		for (int i = 0; i < 5; i++) {
			if (randomboxC[i] != 0) {
				list[index] = randomboxC[i];
				index++;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (randomboxD[i] != 0) {
				list[index] = randomboxD[i];
				index++;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (randomboxE[i] != 0) {
				list[index] = randomboxE[i];
				index++;
			}
		}
		for (int i = 0; i < 5; i++) {
			randomboxC[i] = list[i];
			randomboxD[i] = list[i + 5];
			randomboxE[i] = list[i + 10];
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。

		for (int i : randomboxC) {
			System.out.print(i);
		}
		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i : randomboxD) {
			System.out.print(i);
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i : randomboxE) {
			System.out.print(i);
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
