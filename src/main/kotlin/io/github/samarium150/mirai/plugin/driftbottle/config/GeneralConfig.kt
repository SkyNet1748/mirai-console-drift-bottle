/**
 * Copyright (c) 2020-2021 Samarium
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>
 */
package io.github.samarium150.mirai.plugin.driftbottle.config

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object GeneralConfig : AutoSavePluginConfig("General") {

    @ValueDescription("捡起命令不减少漂流瓶总数")
    val incrementalBottle by value(true)

    @ValueDescription("捡起命令不减少尸体总数")
    val incrementalBody by value(false)

    @ValueDescription("是否启用内容审核")
    val enableContentCensor by value(false)

    @ValueDescription("是否缓存漂流瓶图片到本地")
    val cacheImage by value(true)
}
