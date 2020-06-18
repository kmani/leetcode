package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DomainVisits {
	public static List<String> subdomainVisits(final String[] cpdomains) {
		final HashMap<String, Integer> domainVisits = new HashMap<>();
		final List<String> answer = new ArrayList<>();
		int count;
		String domain;
		for (final String eachVisit : cpdomains) {
			count = Integer.parseInt(eachVisit.split(" ")[0]);
			domain = eachVisit.split(" ")[1];

			String subdomain;
			while (domain.length() != 0) {
				subdomain = domain.split("\\.", 2)[0];
				domainVisits.put(domain, domainVisits.getOrDefault(domain, 0) + count);
				domain = domain.replaceFirst(subdomain, "");
				domain = domain.replaceFirst(".", "");
			}
		}

		for (final String key : domainVisits.keySet()) {
			answer.add(domainVisits.get(key) + " " + key);
		}

		return answer;
	}

	public static void main(final String[] args) {
		subdomainVisits(new String[] { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" });
	}

}
