package io.github.ekuzmichev.query.dm

sealed trait Query
case class And(first: Query, second: Query)    extends Query
case class Or(first: Query, second: Query)     extends Query
case class Not(query: Query)                   extends Query
case class Eq[A](key: String, value: A)        extends Query
case class Neq[A](key: String, value: A)       extends Query
case class In[A](key: String, values: Seq[A])  extends Query
case class Nin[A](key: String, values: Seq[A]) extends Query