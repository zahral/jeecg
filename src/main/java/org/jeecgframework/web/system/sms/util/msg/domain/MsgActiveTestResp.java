package org.jeecgframework.web.system.sms.util.msg.domain;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * 测试激活响应类.
 */
public class MsgActiveTestResp extends MsgHead {
	private static Logger logger = Logger.getLogger(MsgActiveTestResp.class);
	private byte reserved;//

	/**
	 * .
	 * 
	 * @param data
	 *            byte[]
	 */
	public MsgActiveTestResp(byte[] data) {
		if (data.length == 8 + 1) {
			ByteArrayInputStream bins = new ByteArrayInputStream(data);
			DataInputStream dins = new DataInputStream(bins);
			try {
				this.setTotalLength(data.length + 4);
				this.setCommandId(dins.readInt());
				this.setSequenceId(dins.readInt());
				this.reserved = dins.readByte();
				dins.close();
				bins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			logger.info("链路检查,解析数据包出错，包长度不一致。长度为:" + data.length);
		}
	}

	/**
	 * .
	 * 
	 * @return byte
	 */
	public byte getReserved() {
		return reserved;
	}

	/**
	 * .
	 * 
	 * @param reserved
	 *            byte
	 */
	public void setReserved(byte reserved) {
		this.reserved = reserved;
	}
}
