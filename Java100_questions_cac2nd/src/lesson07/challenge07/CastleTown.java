/**
 * 第7章 武士のお仕事
 *
 * 問題7  toString()メソッドの利用
 *
 * toString()メソッドを適切にオーバーライドする。
 *
 * 問題4で作成した藩士クラスと問題5で作成した浪人クラスで
 * それぞれtoString()メソッドをオーバーライドし、<実行例>
 * と同じ結果になるように適切な処理記述しなさい。
 * （※Samuraiクラスにフィールドprotected String nameを追記）
 * （※藩士、浪人ともに名前はコンストラクタで設定する）
 * （※System.out.printlnを利用する）
 *
 * <実行例>
 * 藩士クラスのtoString()メソッドを確認します。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 *
 * 浪人クラスのtoString()メソッドを確認します。
 *
 * 拙者は武州○△□村の浪人、テスト兵衛ともうす。
 *
 */

package lesson07.challenge07;

class Samurai {

	/**
	 * @param name
	 */
	//protectedを使用することでサブクラスでのみアクセスできる
	protected String name;

	//ここにフィールドnameを記述

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

	public String toString() {
		String str = "拙者は○△□藩士、" + name + "ともうす。";
		return str;
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	//samuraiクラスでのnameを使用している
	public Retainer() {
		name = "テスト太郎";

	}

	public void getPaid() {
		System.out.println("給料をもらうよ～");

	}

	public void work() {
		System.out.println("年貢を取り立てるよー");
	}

}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public Ronin() {
		name = "テスト兵衛";
	}

	public void coverd() {
		System.out.println("傘張りするよ～");
	}

	public void work() {
		System.out.println("傘張るよー");
	}

	//toStirngのオーバーライド
	public String toString() {
		String str = "拙者は○△□藩士、" + name + "ともうす。";
		return str;
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士クラスのtoString()メソッドを確認します。\n");

		//ここに適切な処理を記述
		Retainer retainer = new Retainer();
		System.out.println(retainer.toString());

		System.out.println("\n浪人クラスのtoString()メソッドを確認します。\n");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		System.out.println(ronin.toString());

	}
}
