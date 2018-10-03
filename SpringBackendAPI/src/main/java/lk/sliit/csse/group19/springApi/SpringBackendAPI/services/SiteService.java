package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;

/**
 * 
 * @author Dev
 *
 */
public interface SiteService {
	
	public Iterable<Site> getAllSites();
	public Site insertSite(Site site);
	public void deleteSite(int id);
}
