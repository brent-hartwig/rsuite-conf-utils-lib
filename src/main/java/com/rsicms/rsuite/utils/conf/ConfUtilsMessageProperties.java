package com.rsicms.rsuite.utils.conf;

import java.io.IOException;

import com.rsicms.rsuite.utils.messsageProps.LibraryMessageProperties;

/**
 * Serves up formatted messages from messages.properties.
 */
public class ConfUtilsMessageProperties extends LibraryMessageProperties {

	public ConfUtilsMessageProperties() throws IOException {
		super(ConfUtilsMessageProperties.class);
	}

}
