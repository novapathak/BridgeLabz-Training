package com.bridgelabz.dsa.day01.browserbuddy;

public class PageNode {
  protected String url;
  PageNode prev;
 PageNode next;

	PageNode(String url) {
		this.url = url;
	}
}
