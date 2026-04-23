/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		int last = item.length() - 1;//ラストの番目
		char lastchar = item.charAt(last);//ラストの文字
		String lastchr = changeLastChar(lastchar);//最後の文字を引数にする

		if (lastchr != null) {//nullではない＝数字だった
			StringBuffer sb = new StringBuffer(item);//stringbufferクラスを利用し、文字を交換
			sb.replace(last, last + 1, lastchr);
			this.item = new String(sb);//変数itemに格納
		} else {//数字ではなくて文字だった場合
			this.item = item;

		}
	}

	private String changeLastChar(char ch) {//最後の文字を引数にして条件分岐
		String lastchr = null;
		switch (ch) {
		case '0':
			lastchr = "zero";
		case '1':
			lastchr = "one";
			break;
		case '2':
			lastchr = "two";
			break;
		case '3':
			lastchr = "three";
			break;
		case '4':
			lastchr = "four";
			break;
		case '5':
			lastchr = "five";
			break;
		case '6':
			lastchr = "six";
			break;
		case '7':
			lastchr = "seven";
			break;
		case '8':
			lastchr = "eight";
			break;
		case '9':
			lastchr = "nine";
			break;
		default:
			break;
		}
		return lastchr;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する

		String item = null;
		Omegalian omega = new Omegalian();
		omega.setItem(present);
		//ここに適切な処理を記述する

		item = omega.getItem();
		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
