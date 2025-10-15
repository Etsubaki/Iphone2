
public interface Mp3Player {
//↑interface：イメージとしては「これからルールを作る」という宣言
	
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
	
	//abstractを使ってそれぞれのルール(メゾット名のみ)を作っていく
	
	//interfaceとabstrctはセットで使う(メゾット名のみで処理は書かない不思議な形で書いていく)
	
	//メゾット名のみで処理内容は書かないメゾットのことを「抽象メゾット」という。
	//そのため、abstract(抽象的な)というキーワードを入力する
}
