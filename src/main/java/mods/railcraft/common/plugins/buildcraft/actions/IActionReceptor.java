/*
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info
 *
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.plugins.buildcraft.actions;

import buildcraft.api.statements.IActionExternal;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info/>
 */
public interface IActionReceptor {

    void actionActivated(IActionExternal action);
}
