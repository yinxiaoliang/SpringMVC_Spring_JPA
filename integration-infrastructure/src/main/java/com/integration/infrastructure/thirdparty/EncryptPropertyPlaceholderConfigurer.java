package com.integration.infrastructure.thirdparty;

import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.google.common.base.Strings;
import com.integration.infrastructure.utils.AESUtils;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	@Override
	protected String resolvePlaceholder(String placeholder, Properties props) {
		String propval = props.getProperty(placeholder);
		return Strings.isNullOrEmpty(propval) ? propval : AESUtils.decrypt(AESUtils.key, propval);
	}
}
