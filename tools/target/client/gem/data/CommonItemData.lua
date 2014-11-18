



-- create class
local CommonItemData = class("CommonItemData")

		--[[ 道具实例uuid，目前用于客户端实现快捷栏，不可以放入快捷栏的和道具此属性为空 ]]
		CommonItemData.UUID = nil
		--[[ 道具Id ]]
		CommonItemData.itemId = nil
		--[[ 道具名称 ]]
		CommonItemData.name = nil
		--[[ 道具描述 ]]
		CommonItemData.desc = nil
		--[[ 道具小类 ]]
		CommonItemData.type = nil
		--[[ 道具的图标 ]]
		CommonItemData.icon = nil
		--[[ 道具品质 ]]
		CommonItemData.rarity = nil
		--[[ 道具绑定模式 ]]
		CommonItemData.bind = nil
		--[[ 道具堆叠数量 ]]
		CommonItemData.overlapNum = nil
		--[[ 所在背包类型 ]]
		CommonItemData.bagType = nil
		--[[ 所在背包位置索引 ]]
		CommonItemData.bagIndex = nil
		--[[ 出售获取货币类型 ]]
		CommonItemData.sellCurrencyType = nil
		--[[ 出售获取货币数量 ]]
		CommonItemData.sellNum = nil
		--[[ 装备位置 ]]
		CommonItemData.position = nil
		--[[ 道具耐久 ]]
		CommonItemData.endure = nil
		--[[ 装备的孔数 ]]
		CommonItemData.equipHole = nil
		--[[ 镶嵌花费货币类型 ]]
		CommonItemData.embedCurrencyType = nil
		--[[ 镶嵌花费货币数量 ]]
		CommonItemData.embedCurrencyNum = nil
		--[[ 拆除花费货币类型 ]]
		CommonItemData.extractCurrencyType = nil
		--[[ 拆除花费货币数量 ]]
		CommonItemData.extractCurrencyNum = nil
		--[[ 商店购买货币类型 ]]
		CommonItemData.shopCurrencyType = nil
		--[[ 商店购买货币数量 ]]
		CommonItemData.shopCurrencyNum = nil
		--[[ 装备身上带的基础属性 ]]
		CommonItemData.equipBaseAttributes = {}
		--[[ 装备身上带的特殊属性 ]]
		CommonItemData.equipSpecialAttributes = {}
		--[[ 宝石属性 ]]
		CommonItemData.gemAttributes = {}
		--[[ 装备上宝石信息 ]]
		CommonItemData.equipGemItemInfos = {}
		--[[ 装备身上带的强化属性 ]]
		CommonItemData.equipUpgradeAttributes = {}
		--[[ 幸运石的成功率加成值 ]]
		CommonItemData.extraSuccessRate = nil
		--[[ 装备强化等级 ]]
		CommonItemData.upgradeLevel = nil
		--[[ 等级限制 ]]
		CommonItemData.limitLevel = nil
		--[[ 职业限制 ]]
		CommonItemData.limitOccupation = nil
		--[[ 装备最大可以开的孔数 ]]
		CommonItemData.maxEquipHole = nil
		--[[ 制作装备需要的材料列表(装备图纸特有属性) ]]
		CommonItemData.materialsOfEquipPaper = {}
		--[[ 最大可叠加数 ]]
		CommonItemData.maxOverlap = nil
		--[[ 是否已装备 ]]
		CommonItemData.isEquiped = nil
		--[[ 是否可以出售 ]]
		CommonItemData.canSell = nil
