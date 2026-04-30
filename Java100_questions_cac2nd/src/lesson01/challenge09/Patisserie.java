/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("おまたせしました");
		System.out.println("ネルメ");
		System.out.println("開店です");

		//変数用意
		int st = 30;
		int syk = 30;
		int pis = 30;

		System.out.println("おすすめ商品です");
		System.out.println("\nシトロン　　\\250・・・残り" + st);
		System.out.println("ショコラ　　\\250・・・残り" + syk);
		System.out.println("ピスターシュ　　\\250・・・残り" + pis);

		//数字の入力
		System.out.println("\n何個買いますか？");
		System.out.print("\nシトロン      >");
		String buyst = reader.readLine();

		System.out.print("ショコラ      >");
		String buysyk = reader.readLine();

		System.out.print("ピスターシュ  >");
		String buypis = reader.readLine();

		//文字列からdouble型に変換
		double havst = Double.parseDouble(buyst);
		double havsyk = Double.parseDouble(buysyk);
		double havpis = Double.parseDouble(buypis);

		//doubleがたに変換して表示
		System.out.println("\nシトロン　　　　" + havst);
		System.out.println("ショコラ　　　　" + havsyk);
		System.out.println("ピスターシュ　　" + havpis);

		//合計個数　金額の表示
		double total = havst + havsyk + havpis;
		int tatalmo = (int) ((havst * 250) + (havsyk * 280) + (havpis * 320));
		System.out.println("\n合計" + total + "個" + "　合計金額" + tatalmo + "円");

		System.out.println("をお買い上げですね");

		System.out.println("\nシトロン残り" + ((int) (st - havst)) + "個");
		System.out.println("シトロン残り" + ((int) (syk - havsyk)) + "個");
		System.out.println("シトロン残り" + ((int) (pis - havpis)) + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売り上げ合計" + tatalmo + "円");

		//全体から個別の割合を表示
		int pst = (int) ((250 * havst) / tatalmo * 100);
		int psyk = (int) ((280 * havsyk) / tatalmo * 100);
		int ppis = (int) ((320 * havpis) / tatalmo * 100);

		System.out.println("\n内訳");
		System.out.println("シトロン　　　　\\" + (int) (250 * havst) + "・・・" + pst + "%");
		System.out.println("ショコラ　　　　\\" + (int) (280 * havsyk) + "・・・" + psyk + "%");
		System.out.println("ピスターシュ　　\\" + (int) (320 * havpis) + "・・・" + ppis + "%");

		System.out.println("\n明日の三色の配合率が決まりました。");
		System.out.println("シトロン　　　　" + pst + "%");
		System.out.println("ショコラ　　　　" + psyk + "%");
		System.out.println("ピスターシュ　　" + ppis + "%");

		//値段出力　合計売上から個数をわる
		System.out.println("\n値段は\\" + (int) ((tatalmo / total) / 10) * 10 + "です");

	}
}
