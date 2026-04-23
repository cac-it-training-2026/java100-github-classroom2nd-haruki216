/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("おまたせしました");
		System.out.println("ネルメ");
		System.out.println("開店です");

		int st = 30;
		int syk = 30;
		int pis = 30;

		System.out.println("おすすめ商品です");
		System.out.println("シトロン　　\\250・・・残り" + st);
		System.out.println("ショコラ　　\\250・・・残り" + syk);
		System.out.println("ピスターシュ　　\\250・・・残り" + pis);

		System.out.println("何個買いますか？");
		System.out.print("シトロン　　　＞");
		String buyst = reader.readLine();

		System.out.print("ショコラ　　　＞");
		String buysyk = reader.readLine();

		System.out.print("ピスターシュ　＞");
		String buypis = reader.readLine();

		int havst = Integer.parseInt(buyst);
		int havsyk = Integer.parseInt(buysyk);
		int havpis = Integer.parseInt(buypis);

		System.out.println("シトロン　　　" + havst + "個");
		System.out.println("ショコラ　　　" + havsyk + "個");
		System.out.println("ピスターシュ　" + havpis + "個");

		int total = havst + havsyk + havpis;
		int tatalmo = (int) ((havst * 250) + (havsyk * 280) + (havpis * 320));

		System.out.println("\n合計個数　　" + total + "個");
		System.out.println("合計金額　　" + tatalmo + "円");

		System.out.println("をお買い上げですね");

		System.out.println("\n本日のおすすめ商品です");

		//それぞれの変数か入力された数を引く
		System.out.println("シトロン  \\250  ・・・残り" + ((int) (st - havst)) + "個");
		System.out.println("シトロン  \\280　・・・残り" + ((int) (syk - havsyk)) + "個");
		System.out.println("シトロン　\\320　・・・残り" + ((int) (pis - havpis)) + "個");

	}
}
