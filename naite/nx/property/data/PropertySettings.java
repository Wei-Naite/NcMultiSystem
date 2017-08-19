package nx.property.data;


import nx.property.core.Core;

/**
 * Created by User on 2017/7/9.
 */
public class PropertySettings{

	private static int maxLevel; //最高等級
	private static int maxExpDefault;
	private static double maxExpFloat; //經驗值變量

	private static int defaultMaxMana;
	private static int defaultRestoreMana;
	private static long manaRestoreTime;
	private static int defaultMaxHealth;
	private static int defaultRestoreHealth;
	private static long healthRestoreTime;
	private static int defaultMaxMentality;
	private static int defaultRestoreMentality;
	private static long mentalityRestoreTime;
	private static long mentalityDecreaseTime;
	private static int mentalityDecrease;
	private static int defaultMaxVitality;
	private static int defaultRestoreVitality;
	private static long vitalityRestoreTime;
	private static long vitalityDecreaseTime;
	private static int vitalityDecrease;

	private static int defaultAtk;
	private static int defaultMag;
	private static int defaultDef;
	private static int defaultRes;
	private static double defaultAar;
	private static double defaultSar;
	private static double defaultAkb;
	private static double defaultSkb;
	private static double defaultAhit;
	private static double defaultShit;

	private static int maxStr;
	private static int maxInt;
	private static int maxAgi;
	private static int maxLuk;
	private static int maxCon;
	private static int maxWis;

	public static void reload(){
		Core.plugin.reloadConfig();

		maxLevel = Core.plugin.getConfig().getInt("Player.MaxLevel");
		maxExpDefault = Core.plugin.getConfig().getInt("Player.MaxExp.Default");
		maxExpFloat = Core.plugin.getConfig().getDouble("Player.MaxExp.Float");

		defaultMaxMana = Core.plugin.getConfig().getInt("Player.Ability.Mana.DefaultMax");
		defaultRestoreMana = Core.plugin.getConfig().getInt("Player.Ability.Mana.DefaultRestore");
		manaRestoreTime = Core.plugin.getConfig().getLong("Player.Ability.Mana.RestoreTime");
		defaultMaxHealth = Core.plugin.getConfig().getInt("Player.Ability.Health.DefaultMax");
		defaultRestoreHealth = Core.plugin.getConfig().getInt("Player.Ability.Health.DefaultRestore");
		healthRestoreTime = Core.plugin.getConfig().getLong("Player.Ability.Health.RestoreTime");
		defaultMaxMentality = Core.plugin.getConfig().getInt("Player.Ability.Mentality.DefaultMax");
		defaultRestoreMentality = Core.plugin.getConfig().getInt("Player.Ability.Mentality.DefaultRestore");
		mentalityRestoreTime = Core.plugin.getConfig().getLong("Player.Ability.Mentality.RestoreTime");
		mentalityDecreaseTime = Core.plugin.getConfig().getLong("Player.Ability.Mentality.DecreaseTime");
		mentalityDecrease = Core.plugin.getConfig().getInt("Player.Ability.Mentality.Decrease");
		defaultMaxVitality = Core.plugin.getConfig().getInt("Player.Ability.Vitality.DefaultMax");
		defaultRestoreVitality = Core.plugin.getConfig().getInt("Player.Ability.Vitality.DefaultRestore");
		vitalityRestoreTime = Core.plugin.getConfig().getLong("Player.Ability.Vitality.RestoreTime");
		vitalityDecreaseTime = Core.plugin.getConfig().getLong("Player.Ability.Vitality.DecreaseTime");
		vitalityDecrease = Core.plugin.getConfig().getInt("Player.Ability.Vitality.Decrease");

		defaultAtk = Core.plugin.getConfig().getInt("Player.Ability.DefaultATK");
		defaultMag = Core.plugin.getConfig().getInt("Player.Ability.DefaultMAG");
		defaultDef = Core.plugin.getConfig().getInt("Player.Ability.DefaultDEF");
		defaultRes = Core.plugin.getConfig().getInt("Player.Ability.DefaultRES");
		defaultAar = Core.plugin.getConfig().getDouble("Player.Ability.DefaultAAR");
		defaultSar = Core.plugin.getConfig().getDouble("Player.Ability.DefaultSAR");
		defaultAkb = Core.plugin.getConfig().getDouble("Player.Ability.DefaultAKB");
		defaultSkb = Core.plugin.getConfig().getDouble("Player.Ability.DefaultSKB");
		defaultAhit = Core.plugin.getConfig().getDouble("Player.Ability.DefaultAHIT");
		defaultShit = Core.plugin.getConfig().getDouble("Player.Ability.DefaultSHIT");

		maxStr = Core.plugin.getConfig().getInt("Player.AttributeMax.STR");
		maxInt = Core.plugin.getConfig().getInt("Player.AttributeMax.INT");
		maxAgi = Core.plugin.getConfig().getInt("Player.AttributeMax.AGI");
		maxLuk = Core.plugin.getConfig().getInt("Player.AttributeMax.LUK");
		maxCon = Core.plugin.getConfig().getInt("Player.AttributeMax.Con");
		maxWis = Core.plugin.getConfig().getInt("Player.AtrributeMax.Wis");
	}

	public static int getMaxExp(int level){
		return (int) Math.pow(level * maxExpDefault, maxExpFloat);
	}

	public static int getMaxLevel(){
		return maxLevel;
	}

	public static int getMaxExpDefault(){
		return maxExpDefault;
	}

	public static double getMaxExpFloat(){
		return maxExpFloat;
	}

	public static void setMaxLevel(int level){
		maxLevel = level;
		Core.plugin.getConfig().set("player.maxLevel", level);
		Core.plugin.saveConfig();
	}

	public static void setMaxExpDefault(int exp){
		maxExpDefault = exp;
		Core.plugin.getConfig().set("player.maxExp.Default", exp);
		Core.plugin.saveConfig();
	}

	public static void setMaxExpFloat(double f){
		maxExpFloat = f;
		Core.plugin.getConfig().set("player.maxExp.Float", f);
		Core.plugin.saveConfig();
	}

	public static int getDefaultMaxMana(){
		return defaultMaxMana;
	}

	public static int getDefaultRestoreMana(){
		return defaultRestoreMana;
	}

	public static long getManaRestoreTime(){
		return manaRestoreTime;
	}

	public static int getDefaultMaxHealth(){
		return defaultMaxHealth;
	}

	public static int getDefaultRestoreHealth(){
		return  defaultRestoreHealth;
	}

	public static long getHealthRestoreTime(){
		return healthRestoreTime;
	}

	public static int getDefaultMaxMentality(){
		return defaultMaxMentality;
	}

	public static int getDefaultRestoreMentality(){
		return defaultRestoreMentality;
	}

	public static long getMentalityRestoreTime(){
		return mentalityRestoreTime;
	}

	public static long getMentalityDecreaseTime(){
		return mentalityDecreaseTime;
	}

	public static int getMentalityDecrease(){
		return mentalityDecrease;
	}

	public static int getDefaultMaxVitality(){
		return defaultMaxVitality;
	}

	public static int getDefaultRestoreVitality(){
		return defaultRestoreVitality;
	}

	public static long getVitalityRestoreTime(){
		return vitalityRestoreTime;
	}

	public static long getVitalityDecreaseTime(){
		return vitalityDecreaseTime;
	}

	public static int getVitalityDecrease(){
		return vitalityDecrease;
	}

	public static int getDefaultAtk(){
		return defaultAtk;
	}

	public static int getDefaultMag(){
		return defaultMag;
	}

	public static int getDefaultDef(){
		return defaultDef;
	}

	public static int getDefaultRes(){
		return defaultRes;
	}

	public static double getDefaultAar(){
		return defaultAar;
	}

	public static double getDefaultSar(){
		return defaultSar;
	}

	public static double getDefaultAkb(){
		return defaultAkb;
	}

	public static double getDefaultSkb(){
		return defaultSkb;
	}

	public static double getDefaultAhit(){
		return defaultAhit;
	}

	public static double getDefaultShit(){
		return defaultShit;
	}

	public static int getMaxStr(){
		return maxStr;
	}

	public static int getMaxInt(){
		return maxInt;
	}

	public static int getMaxAgi(){
		return maxAgi;
	}

	public static int getMaxLuk(){
		return maxLuk;
	}

	public static int getMaxCon(){
		return maxCon;
	}

	public static int getMaxWis(){
		return maxWis;
	}
}