package com.hifun.soul.core.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.hifun.soul.core.msg.MessageType;

/**
 * 消息类型工具
 * 
 * @author SevenSoul
 * 
 */
public class MessageTypeUtil {
	/** Short类型到String的映射 */
	private static Map<Short, String> shortToNames = new HashMap<Short, String>();

	static {
		for (Field field : MessageType.class.getFields()) {
			try {
				shortToNames.put(field.getShort(field), field.getName());
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 根据Short消息类型获取消息类型名称
	 * 
	 * @param messageType
	 *            short消息类型
	 * @return 如果系统中注册了此类型则返回对应的类型名;否则返回"";
	 */
	public static String getMessageTypeName(short messageType) {
		String result = "";
		if (shortToNames.get(messageType) != null) {
			return shortToNames.get(messageType);
		}
		return result;
	}

	/**
	 * 根据消息类型获取消息类型信息;可以用于日志信息记录;
	 * 
	 * @param messageType
	 * @return
	 */
	public static String getTypeInfo(short messageType) {
		return String.format("type: %d, typeName: %s", messageType,
				MessageTypeUtil.getMessageTypeName(messageType));
	}
}
