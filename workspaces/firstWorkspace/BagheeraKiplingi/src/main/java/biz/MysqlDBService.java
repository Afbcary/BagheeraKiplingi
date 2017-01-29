package biz;

import edu.uci.ics.crawler4j.crawler.Page;

public interface MysqlDBService {

	void store(Page webPage);

	void close();
}
