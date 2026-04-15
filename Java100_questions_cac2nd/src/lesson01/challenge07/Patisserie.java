/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		//変数準備
		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		//文字の入力 doubleへの変換
		System.out.print("シトロン      >");
		String citronBuyCountStr = reader.readLine();
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = reader.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = reader.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		//合計の表示

		System.out.println("\n合計個数 " + (citronBuyCount + chocolatBuyCount + pistacheBuyCount) + "個");
		int tatalmo = (int) ((citronBuyCount * 250) + (chocolatBuyCount * 280) + (pistacheBuyCount * 320));
		System.out.println("合計金額" + tatalmo + "円");

		//型変換duobleからint 小数を切り捨て
		citronStock = (int) (citronStock - citronBuyCount);
		chocolatStock = (int) (chocolatStock - chocolatBuyCount);
		pistacheStock = (int) (pistacheStock - pistacheBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

	}
}
