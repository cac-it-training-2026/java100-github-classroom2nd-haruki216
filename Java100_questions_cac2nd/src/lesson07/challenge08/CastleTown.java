/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package lesson07.challenge08;

class Samurai {

	protected String name;
	protected String domain;

	/**
	 * @param name
	 * @param domain
	 */

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

//ここにRetainerクラスを記述

class Retainer extends Samurai {

	protected String domain;
	protected String name;

	/**
	 * @param name
	 * @param domain
	 * @param domain2
	 * @param name2
	 */

	public void getPaid() {
		System.out.println("給料をもらうよ～");

	}

	/**
	 * @param name
	 * @param domain
	 * @param domain2
	 * @param name2
	 */
	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	public void work() {
		System.out.println("年貢を取り立てるよー");
	}

	public boolean equals(String domain) {
		return this.domain.equals(domain);

	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain セットする domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer2 = new Retainer("テスト次郎", "○△□藩士");
		Retainer retainer = new Retainer("テスト次郎", "○△□藩士");
		System.out.println("拙者の名は" + retainer2.getName() + "ともうす");
		System.out.println("拙者の名は" + retainer.getName() + "ともうす");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer.equals(retainer2.getDomain())) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}

		System.out.println("\n○△×藩の藩士を一つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer3 = new Retainer("テスト三郎", "○△×藩");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		System.out.println("拙者の名は" + retainer3.getName() + "ともうす");

		if (retainer.equals(retainer3.getDomain())) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}
		//ここに適切な処理を記述

	}
}
