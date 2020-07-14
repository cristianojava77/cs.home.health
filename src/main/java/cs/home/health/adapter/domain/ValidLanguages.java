package cs.home.health.adapter.domain;

import java.util.Arrays;
import java.util.List;

import org.springframework.util.StringUtils;

import cs.home.health.exception.InvalidLanguageCodeException;



public enum ValidLanguages {

	// @formatter:off
	EN_US("en_US"),
	ES_ES("es_ES"),
	PT_BR("pt_BR");
	// @formatter:on

	private String code;

	private ValidLanguages(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	/**
	 * Check if the received code belongs to any existing and valid code.
	 *
	 * @param  code
	 * @return      <b>True</b> if the received code is valid, or <b>False</b> otherwise.
	 */
	public static boolean isValid(String code) {
		if ((!StringUtils.isEmpty(code)) && code.length() > 4) {
			final List<ValidLanguages> list = Arrays.asList(values());
			for (ValidLanguages cur : list) {
				if (code.equals(cur.getCode())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Validates the received code and parse it to base spanish, if applicable.
	 *
	 * @param  code The language code to be parsed.
	 * @return      For Portuguese or English codes, return the same code (if valid). For Spanish, returns the base Spanish code instead of the localized. If not valid, throwns an
	 *              <code>InvalidLanguageCodeException</code>.
	 */
	public static String parseLanguage(String code) {
		if ((!StringUtils.isEmpty(code)) && code.length() > 4 && (code.equals(EN_US.getCode()) || code.equals(PT_BR.getCode()))) {
			// US or PT
			return code;
		} else if ((!StringUtils.isEmpty(code)) && code.length() > 4) {
			// ES
			return ES_ES.getCode();
		} else {
			// invalid code
			throw new InvalidLanguageCodeException("Invalid language code received: " + code);
		}
	}

}
