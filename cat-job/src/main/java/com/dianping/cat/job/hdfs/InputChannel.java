package com.dianping.cat.job.hdfs;

import java.io.IOException;
import java.io.InputStream;

import com.dianping.cat.message.spi.MessageTree;

public interface InputChannel {
	/**
	 * Close the channel.
	 */
	public void close();

	/**
	 * Initialize the channel with an output stream.
	 * 
	 * @param out
	 */
	public void initialize(InputStream in);

	/**
	 * Check if the channel is expired.
	 * 
	 * @return true if the channel is expired, false otherwise.
	 */
	public boolean isExpired();


	/**
	 * Fetch message tree from hdfs.
	 * 
	 * @param index
	 * @param length
	 * @return
	 * @throws IOException
	 */
	public MessageTree read(int index, int length) throws IOException;
}
