/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.function.Lambda4;

public interface Monad4<T1, T2, T3, T4, M extends HigherKinded4<?, ?, ?, ?, M>> extends Functor4<T1, T2, T3, T4>, HigherKinded4<T1, T2, T3, T4, M> {

    <U1, U2, U3, U4, MONAD extends HigherKinded4<U1, U2, U3, U4, M>> Monad4<U1, U2, U3, U4, M> flatMap(javaslang.function.Lambda4<? super T1, ? super T2, ? super T3, ? super T4, MONAD> f);
}