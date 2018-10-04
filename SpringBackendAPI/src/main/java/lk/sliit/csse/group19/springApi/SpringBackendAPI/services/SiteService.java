package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;

/**
 * 
 * @author Dev
 *
 */
public interface SiteService {
	
	public Iterable<Site> getAllSites();
	public Optional<Site> findSite(int id);
	public Site insertSite(String authorizedEmployeeId, Site site);
	public Site updateSite(int id, Site siteDetails);
	public boolean deleteSite(int id);
}
