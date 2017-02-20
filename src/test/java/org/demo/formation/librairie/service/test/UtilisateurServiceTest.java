package org.demo.formation.librairie.service.test;

import org.demo.formation.librairie.entity.Utilisateur;
import org.demo.formation.librairie.service.IUtilisateurService;
import org.demo.formation.librairie.service.impl.UtilisateurServiceImpl;
import org.junit.Assert;
import org.junit.Test;


public class UtilisateurServiceTest {

	private IUtilisateurService userService = new UtilisateurServiceImpl();
	
	@Test
	public void testLoginUser(){
		Utilisateur user = this.userService.getUserByEmailAndPassword("christophe.zome@sogeti.com", "czo");
		Assert.assertTrue(user != null);
		user = this.userService.getUserByEmailAndPassword("christophe.zome@sogeti.com", "cfvb");
		Assert.assertFalse(user != null);
	}
}
