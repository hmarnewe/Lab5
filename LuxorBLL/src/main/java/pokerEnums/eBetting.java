package pokerEnums;

import java.util.HashMap;
import java.util.Map;


//Betting enum, sets "No Limit" to default betting type
public enum eBetting {
	
	NoLimit(1, true){
		@Override
		public String toString() {
			return "No Limit";
		}
	},
	PotLimit(2, false){
		@Override
		public String toString() {
			return "Pot Limit";
		}
	};
	private int bettingNbr;
	private boolean bDefault = false;
	private static Map<Integer, eBetting> map = new HashMap<Integer, eBetting>();
	private static Map<String, eBetting> strMap = new HashMap<String, eBetting>();

	static {
		for (eBetting betting : eBetting.values()) {
			map.put(betting.bettingNbr, betting);
			strMap.put(betting.toString(), betting);
		}
	}

	public final static eBetting getBettingFromString(String bettingStr) {
		return strMap.get(bettingStr);
	}

	public static eBetting getBetting(int bettingNbr) {
		return map.get(bettingNbr);
	}

	private eBetting(final int bettingNbr, boolean bDefault){
		this.bettingNbr = bettingNbr;
		this.bDefault = bDefault;
	}

	public int getBetting(){
		return bettingNbr;
	}

	public boolean getDefault(){
		return this.bDefault;
	}

}
	



