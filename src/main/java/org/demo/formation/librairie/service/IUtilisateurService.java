package org.demo.formation.librairie.service;

import org.demo.formation.librairie.entity.Utilisateur;
import org.demo.formation.librairie.exception.DemoBusinessException;

public interface IUtilisateurService extends IAbstractService<Utilisateur>{
	/**
	 * Recup�re un utilisateur par son email et password
	 * @param email : Email pour lequel on souhaiter recuperer l'utilisateur correspondant
	 * @param password : Mot de passe de l'utilisateur recherch�
	 * @return
	 */
	public Utilisateur getUserByEmailAndPassword(String email,String password);
	/**
	 * Verif qu'un email n'existe pas d�j� en base
	 * @param idUser : Identifiant fourni dans le cas d'une mise � jour
	 * @param email : Email dont on cherche l'existence en base
	 * @return
	 */
	public Boolean verifSiEmailExiste(Long idUser,String email);
	/**
	 * Methode permettant de creer ou modifier un utilisateur
	 * @param userACreerOuModifier : Utilisateur � creer ou � modifier
	 */
	public Utilisateur creerOuMetAJourUtilisateur(Utilisateur userACreerOuModifier) throws DemoBusinessException;
}
