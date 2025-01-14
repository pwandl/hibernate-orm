/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */

/**
 * The JPA-standard criteria query API defines all the operations needed express
 * any query written in standard JPQL. This package extends the JPA-defined API,
 * allowing any query written in HQL to be expressed via the criteria API.
 * <p>
 * The gateway to this functionality is
 * {@link org.hibernate.query.criteria.HibernateCriteriaBuilder}, which extends
 * {@link jakarta.persistence.criteria.CriteriaBuilder}.
 * <p>
 * Types defined in this package extend the equivalent types in
 * {@link jakarta.persistence.criteria} with additional operations. For example,
 * {@link org.hibernate.query.criteria.JpaCriteriaQuery} adds the methods:
 * <ul>
 * <li>{@link org.hibernate.query.criteria.JpaCriteriaQuery#from(Subquery)},
 *     which allows the use of a subquery in the {@code from} clause of the
 *     query, and
 * <li>{@link org.hibernate.query.criteria.JpaCriteriaQuery#with(AbstractQuery)},
 *     which allows the creation of {@link org.hibernate.query.criteria.JpaCteCriteria
 *     common table expressions}.
 * </ul>
 *
 * @see org.hibernate.query.criteria.HibernateCriteriaBuilder
 * @see org.hibernate.query.criteria.JpaCriteriaQuery
 * @see org.hibernate.query.criteria.JpaCriteriaUpdate
 * @see org.hibernate.query.criteria.JpaCriteriaDelete
 * @see org.hibernate.query.criteria.JpaCriteriaInsertValues
 * @see org.hibernate.query.criteria.JpaCriteriaInsertSelect
 * @see org.hibernate.query.criteria.JpaCteCriteria
 * @see org.hibernate.query.criteria.JpaSubQuery
 * @see org.hibernate.query.criteria.JpaExpression
 */
@Incubating
package org.hibernate.query.criteria;

import jakarta.persistence.criteria.Subquery;
import org.hibernate.Incubating;
import jakarta.persistence.criteria.AbstractQuery;
