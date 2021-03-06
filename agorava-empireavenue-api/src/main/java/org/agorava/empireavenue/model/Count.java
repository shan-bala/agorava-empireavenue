/*
 * Copyright 2014 Agorava.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.empireavenue.model;

/**
*
* @author Rajmahendra Hegde <rajmahendra@gmail.com>
* @since 0.7.0
*/
public class Count {
	
	private String ticker;
	private int following;
	private int followers;
	private int shareholders;
	private int portfolio;
	private int sharesOwned;
	private int totalThumbsUp;
	private int totalThumbsDown;
	private int listed;
	private int recommended;
	
	public Count() {
    }
	
	@Override
	public String toString() {
	   return new StringBuffer()
	   .append("Count [")
	   .append(ticker)
	   .append(",")
	   .append(following)
	   .append(",")
	   .append(followers)
	   .append(",")
	   .append(shareholders)
	   .append(",")
       .append(portfolio)
       .append(",")
       .append(sharesOwned)
       .append(",")
       .append(totalThumbsUp)
       .append(",")
       .append(totalThumbsDown)
       .append(",")
       .append(listed)
       .append(",")
       .append(recommended)
	   .append("]")
	   .toString();
	}
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public int getFollowing() {
		return following;
	}
	public void setFollowing(int following) {
		this.following = following;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getShareholders() {
		return shareholders;
	}
	public void setShareholders(int shareholders) {
		this.shareholders = shareholders;
	}
	public int getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(int portfolio) {
		this.portfolio = portfolio;
	}
	public int getSharesOwned() {
		return sharesOwned;
	}
	public void setSharesOwned(int sharesOwned) {
		this.sharesOwned = sharesOwned;
	}
	public int getTotalThumbsUp() {
		return totalThumbsUp;
	}
	public void setTotalThumbsUp(int totalThumbsUp) {
		this.totalThumbsUp = totalThumbsUp;
	}
	public int getTotalThumbsDown() {
		return totalThumbsDown;
	}
	public void setTotalThumbsDown(int totalThumbsDown) {
		this.totalThumbsDown = totalThumbsDown;
	}
	public int getListed() {
		return listed;
	}
	public void setListed(int listed) {
		this.listed = listed;
	}
	public int getRecommended() {
		return recommended;
	}
	public void setRecommended(int recommended) {
		this.recommended = recommended;
	}
	
	
}
