package com.erdalyegenaga.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
// kapsam
// yaşam süresi
// performansımızı  + - etkileyecektir
@Named
// @ApplicationScoped // bütün uyg boyunca çalışır ve bütün kullanıcılar için
// @RequestScoped // bir istek boyunca yaşar
// @SessionScoped // bir kullanıcı için yaşar ancak log out olduğu zaman çıkış sağlanır
// @Dependent // bukelemun gibi
// @ConversationScoped // belli istek boyunca yaşar (eticaret sepet ürünü ekledikten sonra ödeme sonrası sepetten çıkması gibi)
// @SessionScoped // Bean bir instance olmasını sağlamak için

public class _00_Scoped {





}
