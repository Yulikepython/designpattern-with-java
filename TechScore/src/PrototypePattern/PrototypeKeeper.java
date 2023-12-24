package PrototypePattern;

import java.util.*;


/** Map<String, Cloneable>で、さまざまなプロトタイプを保存 */
public class PrototypeKeeper {
	private Map<String, Cloneable> map;
	public PrototypeKeeper() {
		this.map = new HashMap<String, Cloneable>();
	}
	
	/** mapに新たなプロトタイプを追加 */
	public void addCloneable(String key, Cloneable prototype) {
		map.put(key,  prototype);
	}
	
	/** 特定のプロトタイプからクローンを取得*/
	public Cloneable getClone(String key) {
		Cloneable prototype = map.get(key);
		return prototype.createClone();
	}
}
